#! /bin/bash

main_dir=../
cwd=$PWD
protoc_version=21.10
protoc_gen_grpc_java_version=1.51.0
tensorflow_version=2.8.4

sudo apt update && sudo apt-get install -y openjdk-11-jdk

echo "🔊installing protoc..."
wget "https://github.com/protocolbuffers/protobuf/releases/download/v${protoc_version}/protoc-${protoc_version}-linux-x86_64.zip"
sudo unzip "protoc-${protoc_version}-linux-x86_64.zip" -d /usr/local/protoc
export PATH=$PATH:/usr/local/protoc/bin
echo "✅ protoc"


echo "🔊installing grpc..."
wget "https://repo1.maven.org/maven2/io/grpc/protoc-gen-grpc-java/${protoc_gen_grpc_java_version}/protoc-gen-grpc-java-${protoc_gen_grpc_java_version}-linux-x86_64.exe"
sudo mv "protoc-gen-grpc-java-${protoc_gen_grpc_java_version}-linux-x86_64.exe" /usr/local/protoc/bin/protoc-gen-grpc-java
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
protoc -I=serving -I=tensorflow --plugin=/usr/local/protoc/bin/protoc-gen-grpc-java --grpc-java_out=java --java_out=java tensorflow/tensorflow/compiler/xla/*.proto
protoc -I=serving -I=tensorflow --plugin=/usr/local/protoc/bin/protoc-gen-grpc-java --grpc-java_out=java --java_out=java tensorflow/tensorflow/compiler/xla/*/*.proto
protoc -I=serving -I=tensorflow --plugin=/usr/local/protoc/bin/protoc-gen-grpc-java --grpc-java_out=java --java_out=java tensorflow/tensorflow/stream_executor/*.proto
protoc -I=serving -I=tensorflow --plugin=/usr/local/protoc/bin/protoc-gen-grpc-java --grpc-java_out=java --java_out=java tensorflow/tensorflow/core/*/*.proto
protoc -I=serving -I=tensorflow --plugin=/usr/local/protoc/bin/protoc-gen-grpc-java --grpc-java_out=java --java_out=java tensorflow/tensorflow/core/protobuf/tpu/*.proto
protoc -I=serving -I=tensorflow --plugin=/usr/local/protoc/bin/protoc-gen-grpc-java --grpc-java_out=java --java_out=java serving/tensorflow_serving/*/*.proto
protoc -I=serving -I=tensorflow --plugin=/usr/local/protoc/bin/protoc-gen-grpc-java --grpc-java_out=java --java_out=java serving/tensorflow_serving/sources/storage_path/*.proto
echo "✅ proto compile"

sleep 3

echo "java dir:"$cwd
cd $cwd;
rm -rf src/main/java/tensorflow src/main/java/org src/main/java/xla src/main/java/stream_executor src/main/java/third_party
mv tensorflow src/main/java
mv org src/main/java
mv xla src/main/java
mv stream_executor src/main/java
mv third_party src/main/java

gradle build