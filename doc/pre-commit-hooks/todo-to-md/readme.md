I had enough to search for my todos in my source code, so I thought I could use Git hooks to write all my todos in a **TODO.md** file and commit it.  

I know that you can list all your todos in netbeans or any other IDEs but I wanted to keep track of them.  

Copy the code below either in your Git repo **<project>/.git/hooks/pre-commit**  
or paste it in the global hooks **/usr/share/git-core/templates/hooks/pre-commit**  

The script will search through the project for all comments with **TODO, @todo** and **FIXME** then overwrite the file each time you do a **git commit**.  

The TODO.md will contain all your todos and shows you which file and line:  
*./test.php:21: // TODO test the method*  
*./test.php:105: // TODO create a list*  