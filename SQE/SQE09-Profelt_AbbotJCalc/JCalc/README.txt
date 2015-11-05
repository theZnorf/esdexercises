JCalculator 0.1b (http://www.sourceforge.net/projects/javcalc)

This is the alpha version of my first Open Source project JCalculator.
It is a calculator written entirely in Java for cross-platform portability.  For now, it is fairly basic, as this is one of my first programs involving a GUI (Graphical User Interface).  Many features may be added in the course of development.  Right now, I am looking to get the basic calculator of the ground, capable of basic exponentiation, factoral, and the standard four functions.

INSTALLATION

To run this program, you will need Java 2 Runtime Environment.  It should use the Java API 1.4.1 or higher.  You can download the latest runtime environment at http://java.sun.com.

Once you decompress the archive (either as a zip or tarball), extract the files to a directory, preferrably your CLASSPATH directory for the Java Runtime Environment.  If you do not wish to have the source code you may delete JCalculator.java.

To Set Classpath in Windows 9x:

 	In Windows 9x you must edit your AUTOEXEC.BAT file by adding a line similar to this:
 
 	CLASSPATH=(location of the *.class files for JCalculator)



 	If neither of these methods work for setting CLASSPATH, please consult the Java Runtime Environmanet and Operating System documentation.  However, you can always run the program directly from the folder in which it is contained.

To Set Classpath in Windows (2000,NT,XP):

	Right-click on My Computer and go to Properties
	
	Click the Advanced Tab and select Environment Variables

	Choose CLASSPATH from the list and edit it.

To Set Classpath in Linux and other *nix environments (instructions based on RH distro using BASH):


	You must edit your personal .bashrc and .bash_profile files in your /home directory

	To make it available to all users on the system, edit your /etc/profile

 export CLASSPATH=$CLASSPATH: (directory where *.class are located);

TO RUN THE PROGRAM

 On Windows systems, extract the JCalc.bat file to a folder, this will serve as a shortcut.  When you double-click it will open a command-line window and run the command automatically. 

	On *nix systems, there should be a script file included with the tarball.  Extract it to one of your PATH directories, or make a shortcut on the Desktop with it.

	If you're using one of the shortcut methods you may have to run it manually yourself using the 
		java Jcalculator

command to get any error messages if you have been having troubles running the program.

	If you get an "Exception in thread main java.lang.NoClassDefFoundError:  Jcalc" the CLASSPATH variable is not set properly, and you  need to edit it using the method described in the installation procedures.

	If you get a "Command Not Found" error, your PATH variable is set incorrectly, and you should edit it using the same methods as you change the CLASSPATH in the installation procedures above.
