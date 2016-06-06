#!/bin/bash
javac Dry.java
jar cfe dry.jar Dry Dry.class
rm Dry.class
sudo mv dry.jar /usr/bin/dry.jar