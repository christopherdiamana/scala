#!/bin/bash

for i in $(seq 0 1); do
    n=0
    for f in $(find -name "part*"); do
        n=$(($(cat $f | grep "peaceWatcherId\":$i" | wc -l)+n))
    done

    echo "PeaceWatcher $i: $n"
done
