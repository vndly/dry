#!/bin/bash
mvn clean
mvn compile
mvn package

mv target/dry-0.0.1.jar release
mv release/dry-0.0.1.jar release/dry.jar