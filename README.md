# git-games-workshop2
A collection of git based challenges for GrizzlyHacks' second git workshop

## Instructions

1. Fork this repository to your own account.
2. Clone *your personal* fork.
3. Make sure you fetch *all* of the branches using `git fetch --all`
4. As you complete each challenge, submit a pull request.

### Challenge 1
**Merge a branch with master**

Simply merge the branch "mergeme" with master.

### Challenge 2
**Find the commit that broke master**

Inside the master branch, you'll find a program called *Broken.java*. Everything was working fine, and we were able to compile the program using `javac Broken.java`. Recently, someone made a commit that broke our program, and now the output of `javac Broken.java` looks like this:

```
Broken.java:12: error: ';' expected
                System.out.println("Welcome to Challenge 2, " + name + "!")
                                                                           ^
1 error
```

Use `git log` to find the commit that broke the program and add that commit ID to a new file called "broken.txt".

**hint** *Broken.java was fine at commit "4924d9d3141af5fa2d4146abeb0e8a2450a849bd". The change that broke it came sometime after.*

**hint** *Based on the output of `javac Broken.java`, look for a commit that includes a line with a missing semicolon.*

### Challenge 3
**Rebase a branch onto master**

There is a branch called "rebaseme". Add it to master without using `git merge`.

**Bonus:** Use interactive rebase to squash the two commits into one.
