#!/bin/bash
(javac -Xmaxerrs 1 -d bin/pc $(find . -name "*.java") && echo "Build successful" || echo "Build failed!") && (jar cfe sinma.jar com.fmajka.compat.j2se.MainJ2SE -C bin/pc . && echo "Jar successful!" || echo "Jar failed!")
