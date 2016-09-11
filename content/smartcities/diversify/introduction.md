---
title: "The Diversify Project"
description: "Diversify is an FP7-FET project, that aims to introduce diversity into multiple levels of software engineering"
tags: ["research", "diversify-project"]
date: "2013-04-02"
slug: ""
---
[Diversify](http://diversify-project.eu/) is an EU FP7 project, that aims at 
leveraging diversity, to improve software systems. <!--more--> An inter-disciplinary 
effort, one of our partners is the ECOBIO[^1] group
 from the [Université de Rennes 1](http://www.univ-rennes1.fr/english/). The 
intent is that knowledge, concepts, and techniques flow in a two-way stream, 
between ecology and computer science. The full list of partners is as follows:

* [INRIA](http://www.inria.fr/en/centre/rennes)
* [SINTEF](http://www.sintef.no/home/)
* [TCD] (http://www.tcd.ie/)
* [Université de Rennes 1](http://www.univ-rennes1.fr/english/)

TCD works, along with INRIA and SINTEF, to automatically insert diversity into software. There are several levels at which a software system can be characterized:

* [Source code level](https://people.rennes.inria.fr/Benoit.Baudry/data/)
* [Algorithmic level](/diversify/algorithmic-diversity)
* [Architectural level](https://www.sintef.no/en/publication/?pubid=CRIStin+1280693)
* Ecosystem level (one piece of software in relation to others)

At each of these levels, our perspectives and concerns are different, and so are 
the basic units that can be manipulated. At TCD, we are focussed on the change 
in system, induced due to [algorithmic 
diversity](/diversify/algorithmic-diversity).  That is, can we predict the 
effect on a system, produced *solely* due to the presence of a diversity of 
algorithms?  What does it mean to have a "diversity of algorithms" anyway? If 
diversity is better (or worse), can we increase (or decrease) this diversity, in 
an automated manner? These are the questions that we seek to answer, in this 
project.

SmartHopper
-----------
The Diversify project also uses a smart-mobility test-bed to experiment with, 
for all of the diversification techniques mentioned above, *i.e.*, 
[SmartHopper](/smarthopper/). SmartHopper is derived from the open-source 
routing project, [GraphHopper Library](https://github.com/graphhopper/graphhopper/), by the lovely folk at [GraphHopper](https://graphhopper.com/)

We've made a fair few modifications to it, to enable both, experimentation with 
diversification techniques, as well as allow sensor information to be utilized 
on top of OpenStreetMaps plus routing. For more details, look at the 
[SmartHopper page](/smarthopper/)


[^1]: http://ecobio.univ-rennes1.fr/dernieres_publications.php
