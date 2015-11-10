---
title: "SmartHopper"
description: "Adding Participatory Sensing to Routing for Smart Mobility"
tags: ["research", "smart mobility", "smart cities", "participatory sensing", "noise"]
categories: 
   - "research"
   - "software engineering"
slug: ""
project_url : "https://github.com/DIVERSIFY-project/SMARTH-GH.git"
---

#### Introduction

Ever since the SETI@Home project took off, the idea of using `crowd power' to help out with computing needs has been explored by many projects. The explosion of 
the smartphone market opened up a niche in this voluntary computing world. Suddenly, participatory sensing became a means to harness the power of the crowd
in an almost-literal sense. <!--more--> Given enough enthusiastic participants, researchers could potentially get access to sensor measurements that could be statistically
massaged to get a treasure-trove of GPS-tagged data. However, the excitement of such potential quickly waned as the number of enthusiastic participants dropped with 
each additional participatory sensing app, that arrived on the app-market.

We believe that more people can be motivated to contribute data to research, if this contribution can be linked to a tangible benefit that citizens can receive
in turn, for volunteering their time and data. *SmartHopper* is a smart mobility platform, developed at TCD, that incorporates participatory sensing and combines
it with an open-source routing engine, to enable citizens to generate smarter routes for themselves. 

#### Basic Idea
We collaborate with the good folks working on the [NoiseTube Project](http://www.noisetube.net/) at [Vrije Universiteit Brussel](http://www.vub.ac.be/) and ask volunteers to walk around Dublin city, so that 
we get noise measurements from different streets. Given enough walkers, we are able to generate a `Noise Map` of Dublin on a street-by-street basis. Then we transform
this data, and insert it into a Redis store. We also forked the open-source [GraphHopper](http://graphhopper.com/) project, to allow it to be deployed and queried 
using REST-based API. Now, when you query SmartHopper, it is able to combine a query for a route from (say) Trinity College to (say) Dundrum, with the noise information
gathered from the volunteers and generate the `least noisy' route between them. This can be useful for parents with infants, or elderly people wishing to take a walk,
as it enables them to choose a route, that is least affected by noise pollution. For more information about the architecture of the system, check out our [paper](http://www.tara.tcd.ie/handle/2262/73955?show=full), published
at the Open Source Systems conference. Also, check out the SmartHopper UI page, where you can see screenshots of the system in action.

#### Other Ideas

Noise is merely an exemplar of what is possible, by combining sensor data with other software. Smarter routes can be enabled, limited only by the availability of data.
We are trying to get air pollution data of several kinds, which can be quite useful for sufferers of pollen allergies, asthma, etc. to generate routes that may 
not necessarily be the fastest or the shortest, but are more to their liking. We're looking into tapping into Open Data from any source that is able to generate
consistent and city-wide data, which can then be automatically turned into query-able routes! Smart Mobility is not merely about using technology to find 
taxis or public transport, but also being able to query the state-of-the-city, in a personalized manner. If you want to talk to us about data that you have, or ideas
to increase the smartness of SmartHopper, get in [touch](/contact/).

