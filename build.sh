#!/bin/bash
status=0

if javac -Xmaxerrs 1 -d bin/j2se $(find . -name "*.java"); then
    echo "Build successful"
else
    echo "Build failed!"
    status=1
fi

if [ $status -eq 0 ]; then
    if jar cfe sinma.jar org.tohosinma.compat.j2se.MainJ2SE -C bin/j2se .; then
        echo "Jar successful!"
    else
        echo "Jar failed!"
        status=1
    fi
fi

exit $status
