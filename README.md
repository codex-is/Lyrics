# 🎵 PrintLyrics

A simple Java program that displays song lyrics with a **typewriter-style animation**. Each line is printed character-by-character with customizable delays to simulate a lyrical or poetic presentation.

## 📋 Features
- Smooth typewriter effect for displaying lyrics
- Custom delay per line and per character
- Easily extendable or modifiable lyrics
- Great for creative terminal-based projects

## 🧠 How It Works
Each lyric line is defined with:
- The text to display
- A delay after the entire line (`lineDelay`)
- A delay between each character (`charDelay`)

The program loops through each line, printing characters with a delay and pausing after each line before printing the next.

## 📁 Structure

```java
List<String[]> Lyrics = Arrays.asList(
    new String[]{"<lyric line>", "<lineDelay in ms>", "<charDelay in ms>"},
    ...
);
