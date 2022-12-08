#!/bin/bash

main_dir=../
cwd=$PWD
go_version=1.19.4
tensorflow_version=2.8.4

echo "🔊 install golang ${go_version}"
wget https://dl.google.com/go/go${go_version}.linux-amd64.tar.gz
tar zxvf go${go_version}.linux-amd64.tar.gz -C /usr/local
export PATH=$PATH:/usr/local/go/bin
export GOPATH=/usr/local/go
echo "✅ golang"

echo "🔊installing protoc..."
wget "https://github.com/protocolbuffers/protobuf/releases/download/v${protoc_version}/protoc-${protoc_version}-linux-x86_64.zip"
sudo unzip "protoc-${protoc_version}-linux-x86_64.zip" -d /usr/local/protoc
export PATH=$PATH:/usr/local/protoc/bin
echo "✅ protoc"


echo "🔊installing grpc..."
go get -u google.golang.org/protobuf/cmd/protoc-gen-go
go get -u google.golang.org/grpc
echo "✅ grpc..."

sudo chmod +x /usr/local/protoc/bin/*


echo "🔊update tensorflow and serving version: ${tensorflow_version}"
git submodule init 
git submodule update
cd ${main_dir}
cd tensorflow ; git checkout tags/v${tensorflow_version}
cd ../serving ; git checkout tags/${tensorflow_version}
cd ..
echo "✅ tf version"

echo "🔊compile proto files"
protoc -I=serving -I=tensorflow --go_out=plugins=grpc:golang serving/tensorflow_serving/*/*.proto
protoc -I=serving -I=tensorflow --go_out=plugins=grpc:golang serving/tensorflow_serving/sources/storage_path/*.proto
protoc -I=serving -I=tensorflow --go_out=plugins=grpc:golang tensorflow/tensorflow/core/framework/*.proto
protoc -I=serving -I=tensorflow --go_out=plugins=grpc:golang tensorflow/tensorflow/core/example/*.proto
protoc -I=serving -I=tensorflow --go_out=plugins=grpc:golang tensorflow/tensorflow/core/protobuf/*.proto
protoc -I=serving -I=tensorflow --go_out=plugins=grpc:golang tensorflow/tensorflow/stream_executor/*.proto
echo "✅ proto compile"

cd $cwd