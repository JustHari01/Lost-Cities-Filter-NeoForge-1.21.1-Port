# Lost Cities Filter (UNOFFICIAL)

Unofficial NeoForge 1.21.1 port of [Lost Cities Filter by Varamos](https://modrinth.com/mod/lostcitiesfilter).

The original project's Modrinth metadata declares the MIT License. Its published file does not include source code or a separate license file, so this port preserves the declared MIT terms and credits the upstream project and author.

## What it does

This port keeps the original filter behavior:

- Filters five configured message fragments from Log4j output.
- Cancels two configured message fragments before they appear in the in-game chat.
- Does not change Lost Cities world generation or gameplay.

The chat event handler loads only on the physical client. Log filtering runs on both client and dedicated server.

## Build

Use Java 21 and run gradlew.bat build.

## License and attribution

The port and upstream portions are distributed under the MIT License in LICENSE.

Upstream project: [Lost Cities Filter](https://modrinth.com/mod/lostcitiesfilter) by [Varamos](https://modrinth.com/user/Varamos). The upstream project does not provide a source repository link in its Modrinth metadata. Port source: [JustHari01/Lost-Cities-Filter-NeoForge-1.21.1-Port](https://github.com/JustHari01/Lost-Cities-Filter-NeoForge-1.21.1-Port).

This is an unofficial port and is not affiliated with or endorsed by the original author.

AI tools assisted with the NeoForge compatibility port and this documentation; the original mod is by Varamos.
