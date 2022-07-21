##Reference

##Maven Command
1. mvn or ./mvnw

2. mvn compile
3. mvn clean package
4. mvn spring-boot:run (run package)
5. mvn clean package spring-boot:run
6. mvn spring-boot:run -Dspring-boot.run.arguments="--port=3000" (when you run with parameters)
7. mvn spring-boot:run -Dspring-boot.run.arguments="--port=3000 --dataDir=/Users/nursakinah/data"
8. mvn clean test (only the test part, not the whole part)

##Git Command

1. git init (initialise a local repo, doesnt link to remote yet)

2. <create a git remote repo>

3. git remote add origin https://github.com/<username>/<reponame>.git

4. git add . (add new/updated files locally)

5. git status (to check files that are going to commit into local repo)

6. git commit -m "<intial message>" (commit files to local repo)

7. git push -u origin master (creates a master branch in github and push the code to github master branch)

8. <dont develop in master branch - final/latest working baseline>

9. git checkout -b develop master (clone a copy from master to develop branch locally, -b is to create new branch)

10. git push -u origin develop (push from local develop branch to github develop branch)

11. git checkout develop (to switch between branches using the checkout command)

12. git branch -a (show all local branches and remote branch references)

13. gti branch (show all local branches)

14. <always develop in develop branch>

<assuming youre in develop branch>

15. git add . 
16. git commit -m "<commit changes>"
17. git push -u origin develop (push code on local develop branch to github develop branch)

18. git checkout master
19. git merge develop (after changes in develop branch are complete without errors, in master branch, merge changes from develop branch)
20. git push -u origin master (in master branch to push merged changes from develop branch to github master branch)


##Deploy to Heroku (must be on master branch locally and remote)

1. Create/use an exisiting heroku account
2. On your project root, you need a system.properties file 
3. put the following line in system.properties files (java.runtime.version=18)

4. git add .
5. git commit -m "<added/updated system.properties>"
6. git push -u origin master
7. heroku login in your terminal window/command prompt in the project directory)
8. heroku apps:create
9. git remote -v (all remote branches. you should see reference URL to heroku)
10. git push -u heroku master