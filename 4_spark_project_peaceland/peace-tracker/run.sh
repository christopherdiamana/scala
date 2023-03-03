#!/bin/bash

if [ $# -lt 1 ]; then
    echo "Specify object name"
    exit 1
fi

# ./spark/bin/spark-submit --packages io.delta:delta-core_2.12:1.0.0 --class $1 --master local[4] /home/otiose/repos/epita/scala/peace-tracker/target/scala-2.12/hello-world_2.12-1.0.jar
./spark/bin/spark-submit --class $1 --master local[4] /home/otiose/repos/epita/scala/peace-tracker/target/scala-2.12/hello-world_2.12-1.0.jar $2


