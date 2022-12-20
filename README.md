# Maven template for Java Swing projects with native installers

Create native application installers for Mac and Windows by running the *install* phase in a Maven-managed Java project. The scripts in this package rely on the tools `jdeps`, `jlink`, and `jpackage` which are shipped along with OpenJDK.

## Prerequisites 

* OpenJDK 17 or newer (e.g. https://adoptium.net/)
* Additional prerequisites for Windows:
  * WiX Toolset (https://wixtoolset.org/) which at the time of writing further requires:
    * .NET Framework 3.5 (https://dotnet.microsoft.com/en-us/download/dotnet-framework/net35-sp1)

## Configuration

To configure your project, you need to update the project properties in the beginning of [pom.xml](./pom.xml). In particular, you must change the properties of *groupId*, *artifacId*, *name*, *app.main.class* and *app.vendor* to match what you use in your project.

## Icons

Executables require an application icon. Default icons are part of the project. Feel free to use it for your development efforts but make sure to replace it with your own before shipping your product. The platform-specific icons can be found inside src/main/logo.

## Building the Project
Once your environment is set up you can simply call `mvn clean install`. It will do a standard build of the application and in addition it will analyze all the dependencies and copy the resulting set of JAR files into the folder target/libs. This work is done via the Maven dependency plugin. Once the standard build is completed Maven will invoke the shell script (on Mac) or the batch script (on Windows). The Maven [pom.xml](./pom.xml) uses two different profiles, both of them being activated via the OS that they are running on.

## Credits and more details

This template is based on the excellent [template by dlemmermann for JavaFX projects](https://github.com/dlemmermann/JPackageScriptFX). The template you see here is simplified and is tailored towards Swing projects for students in introductory programming courses. Hence, for a more in-depth documentation and an example using a multi-module maven setup, please check out the original source: https://github.com/dlemmermann/JPackageScriptFX
