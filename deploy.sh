#!/bin/bash

echo -e "\033[0;32mRemoving the public directory if it exists...\033[0m"
rm -rf public

echo -e "\033[0;32mRemoving the git cache of public...\033[0m"
git rm --cached public

echo -e "\033[0;32mAdding public as a submodule...\033[0m"
git submodule add --force https://github.com/viveknallur/viveknallur.github.io.git public 

echo -e "\033[0;32mBuilding site...\033[0m"
# Build the project.
hugo # if using a theme, replace by `hugo -t <yourtheme>`

# Go To Public folder
cd public
# Add changes to git.
git add --all :/

# Commit changes.
msg="rebuilding site `date`"
if [ $# -eq 1 ]
  then msg="$1"
fi

echo -e "\033[0;32mCommitting...\033[0m"
git commit -m "$msg"

echo -e "\033[0;32mDeploying updates to GitHub...\033[0m"

# Push source and build repos.
git push origin master

# Come Back
cd ..