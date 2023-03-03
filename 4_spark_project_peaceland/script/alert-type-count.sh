#!/bin/bash

for i in $(seq 0 1); do
    n=0
    for f in $(find -name "part*"); do
        n=$(($(cat $f | grep "peacescore\":$i" | wc -l)+n))
    done

    echo "Type $i: $n"
done
