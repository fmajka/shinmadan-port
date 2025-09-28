# Touhou Shinmadan Port

This is a fanmade port of a fanmade Touhou Project game, Touhou Shinmadan. It consists of decompiled code of the game, stub implementations of the necessary DoJa specification, and a minimum compatibility layer for the game to function, alongside some small quality of life additions.

## How it all started

The chain of events that eventually led to me creating this project started with me accidentaly finding some old dumbphones, which my parents used to use back in the day. One of them still worked, and I liked its style, so I dreamed that it would be cool to make a simple Touhou-like game for it. But first I decided to see if a game like that already exists. That's how I stumbled upon Touhou Shinmadan, but unfortunately I wasn't able to install it on the phone. This eventually led me into the DoJa rabbit hole. Knowing that Java source code is easy to decompile, I thought that an even cooler idea than making my own J2ME game would be porting Shinmadan to the Java Micro Edition standard. And so this is how this project began...

## Goals

In order to make things easier for myself, as this is the first time I'm doing this kind of project, my initial goal is to port the game to PCs. One of the rules I set is to separate the Doja stubs and the platform-specific implementation as neatly as possible, so that adding support for different platforms is easy and doesn't require to modify the existing code.

To make the game more accessible, I'm also slowly working on an English translation of the in-game text and dialogues. I modified the decompiled source code slightly, so that in the future, translations for other languages could be added as well.

## Useful links

 * [Touhou Shinmadan webpage](https://womohide.turubeotoshi.com/SHIN/thSHIN.html)
 * [Download link for the game (and 2 other Japanese dumbphone Touhou fangames)](https://mega.nz/folder/RnlVDYDS#sHrSexyoRx8H8_Am0CwqSw/folder/Jq0kSa5S)
 * [DoJa emulator setup guide](https://docs.google.com/document/d/1iELxocYKh-hDV6hk7SYsnb7AHU1j1JkgolC6kz61PA8/edit?tab=t.0#heading=h.d06xxj7nzib6)

## Special thanks

TODO: mention the issue with playing the music and the wonderful solution to this problem.

## Disclaimer

***This project is an unofficial fan port. All characters, music, and related intellectual property belong to their respective creatorsincluding Team Shanghai Alice (ZUN).***

***This port is distributed for preservation and accessibility purposes only. No ownership of the original work is claimed, and no copyright infringement is intended.***