---
title: "Algorithmic Diversity"
description: "Algorithmic diversity aims to quantify the amount of natural diversity available in a pool of algorithms, and their effect on system properties"
tags: ["research", "algorithmic diversity", "software engineering", "quality attributes", "diversify-project"]
date: "2014-04-02"
slug: ""
---
Algorithmic diversity aims to quantify the amount of natural diversity available in a pool of algorithms, and their effect on system properties. <!--more--> In many domains, 
there are multiple algorithms available that can perform the same / similar tasks. For example, there are a plethora of algorithms available for sorting, load-balancing,
compression, etc. Almost every computer science student studies multiple sorting algorithms, and their respective complexity (big-O). Apart from complexity, there are
many aspects in which algorithms differ, data structures, strategies, etc. These aspects have an impact on the real-world performance of software systems. In most
cases, the developer or system administrator tries to foresee the operating environment of the software system, its input characteristics and chose the best / optimal
algorithm, that they could possibly implement. However, in the real world, operating environments rarely stay stagnant and the desired quality attributes of the system
do not stay at the same level, as when deployed. 

We are investigating whether using a pool of algorithms, instead of a single optimal pre-chosen algorithm, could impact the software system's quality attributes
in a positive way, and if so, how do we quantify it? And herein lies the challenge. A little reflection would lead us to the conclusion that, in an uncertain 
operating environment, using a pool of algorithms would definitely affect the system's robustness, but by how much? And can we pre-determine the 
amount of diversity in this pool? These are some of the questions that we aim to answer, with our experiments in algorithmic diversity.