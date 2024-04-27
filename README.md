RubyDung 2009 API
-----------------
This is a crazy API from crazy people providing a ***modding API*** for one of the ***first versions of Minecraft*** from the year 2009 (back then still named *RubyDung*).

This repository contains only bare API abstract classes and interfaces, similarly to Bukkit - without any implementations into the actual game. It should only serve as a starting point to allow people the creation of a modded RubyDung experience.

Downloads
---------
You can download the latest API release from the [releases page](https://github.com/martinambrus/RDApi/releases) 
page here on GitHub.

Building
--------
This repository contains all the tools necessary to build a JAR file with the full API. 
Here are the steps:

1) install [gradle](https://gradle.org/) (v8.5 is tested) - or better yet, get the free Java development IDE [IntelliJ Idea](https://gradle.org/)
2) run two gradle tasks:
    1) *first_time_run*
    2) *jar*

You can use the generated JAR file (located in *build/libs* folder) to start working on your 
very own RubyDung plugin. You'll need to add that file as a dependency to your plugin. 
Check the sample [Time Slower mod](https://github.com/martinambrus/RDModTimeSlower) 
for an example of how to code a RubyDung mod.

More Resources
--------------
Check out the [RDModded repository](https://github.com/martinambrus/RDModded) 
for the actual modded game experience.

You may also want to check the [Minecraft Veteran Servers YouTube Channel](https://www.youtube.com/channel/UCMiKrpX4ViX4PGBOq1UXlvQ) for videos on creation of all this nonsense and perhaps some inspiration for creation of your own game / Minecraft clone :-D