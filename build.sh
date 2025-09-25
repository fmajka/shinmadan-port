#!/bin/bash
status=0

if javac -Xmaxerrs 1 -d bin/pc $(find . -name "*.java"); then
    echo "Build successful"
else
    echo "Build failed!"
    status=1
fi

if [ $status -eq 0 ]; then
    if jar cfe sinma.jar com.fmajka.compat.j2se.MainJ2SE -C bin/pc .; then
        echo "Jar successful!"
    else
        echo "Jar failed!"
        status=1
    fi
fi

exit $status
