---
title: "Reproducible Results in Software Engineering"
description: "How to ensure reproducible results in software engineering"
tags: ["research", "self-adaptive", "emergence", "socio-technical 
systems","feedback loops"]
date: "2015-08-02"
slug: ""
layout: "post"
---

------------------------------------------------------
> Perhaps the central problem we face in all of computer science is how we are 
> to get to the situation where we build on top of the work of others rather 
> than redoing so much of it in a trivially different way. 
>
------------------------------------------------------
-- Richard Hamming (From Turing Award lecture(1968))
*Journal of the ACM (Jan 1969), 16, No. 1, 10.*

#### Reproducing and Sharing Results of Experiments in Software Engineering

Richard Hamming's statement has perhaps never been as true, as it is true today. There are literally hundreds of conferences, with tens of thousands of papers published every year. Surely, going by the volume of output, we should be in a much better position with regard to the big problems, than we are at the moment. Of course, there are some problems that are genuinely hard, but even so, a whole lot of effort is expended in trying to do something trivially better or trivially different.

Part of the problem is that, at least in computer science, there's no value accorded to repeating and verifying experiments. Due to the proliferation of platforms, libraries, languages, the amount of effort involved in reproducing someone else's experiment is so huge that the average researcher doesn't attempt it. If one is unable to reproduce a result, so what? It must be because the environment wasn't just right, or the data-structure wasn't the same as the one in the paper. Or reproducer's code is wrong (even more insidiously, "has a bug"). The net result is that not many results are reproduced, which of course, then leads to a situation, where published papers have non-reproduceable results! This state of affairs would be unacceptable in any other science.


While Software Engineering has yet to figure out how to document and preserve forever and ever, the ideas/decisions/assumptions behind a big piece of code, we have reached a point where it is possible to checkpoint a piece of working code and make it available economically to anyone who wants it. Virtual Machines, while cool and dandy, are terribly big and difficult to share. Docker containers, though, in  my opinion, hit a sweet spot where, for certain kinds of code and libraries, the exact configuration and environment can be captured and shared with the world. Thanks to the Docker hub, we can also be reasonably sure that it (the code) won't go away, as soon as researcher moves institutions (To my great mortification and embarrassment, all of my code and data vanished from my PhD student website, soon after I graduated. Which meant that reproducing (and building upon) my TSE paper results was next to impossible).

#### Docker Hub Address
Having learnt my lesson, I'm going to put up all of  my paper submissions' code
up on Docker Hub in a docker container. So, at the very least, folks can reproduce my results, if not build on it. I'm also trying to convince my colleagues to do the same.

[Vivek Nallur's Docker Hub Repo](https://hub.docker.com/r/viveknallur/)


