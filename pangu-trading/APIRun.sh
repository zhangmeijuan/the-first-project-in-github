#!/bin/bash

set -ex
# goto current directory
CUR_DIR=`dirname "$0"`
cd "$CUR_DIR"
# rm old report
rm -rf Report
mkdir Report
# install Helper project
cd Helper
mvn eclipse:clean eclipse:eclipse
mvn clean install -Dmaven.test.skip=true
# generate TestProject
mvn api:genTests -U
cd ..
# run TestProject tests
cd TestProject
mvn clean test || cp -r target/surefire-reports/html/* ../Report
