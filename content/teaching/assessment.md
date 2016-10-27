---
title: "CS3012 - Assessment"
description: "Assessment pattern for CS3012"
tags: ["teaching", "cs3012","software engineering"]
date: "2016-11-25"
slug: ""
---

The assessment pattern for the module is as follows:
<!--more-->
There are two components to the module evaluation:

+ Theory (evaluated using an exam) -- 30% of your final mark

+ Practical (evaluated using assignments and a mini-project) -- 70% of your 
  final mark

![Overall Assessment](/images/cs3012/OverallAssessment.png "Overall assessment 
pattern")

There is a difference between software engineering 'in-the-large' and software 
engineering 'in-the-small'. As explained during the first class, most of the 
lecture material covers software engineering in the large. Large, means teams 
that comprise multiple individuals acting as requirements analysts, software 
architects and designers, coders, testers, deployment engineers, etc. Typically, 
the set of people involved in such a process is on the order of tens of 
individuals (if not hundreds or thousands, for larger projects). Given our 
current class size and constraints on time, it is not possible to create 
assignments that involve group sizes of 15-25 people and evaluate them (as a 
group, and as individuals) continuously, over the period of the term. This is 
why the evaluation pattern tries to evaluate software engineering in the small. 
Software Engineering in-the-small attempts to measure and evaluate the personal 
productivity AND predictability of an individual over a period of time. This is 
why there are programming assignments that you submit (personal productivity) 
along with the EngineersLog (personal predictability) every week. We also 
evaluate group-work that allows students to put into practise some of the 
software engineering theory that they have been taught. Group-work will be done 
via a mini-project, that must be performed using the Scrum methodology.  This is 
still engineering in-the-small due to group and project size. Details of the 
mini-project can be found [here](/teaching/project)


The evaluation of the individual assignments is explained below. 

<hr/>

#### Evaluating an individual assignment

Each individual assignment has three components that contribute toward your 
mark:

1. *Test cases*: A test case reflects logical correctness of your code.  
   Ultimately, a system that does not generate the correct output for the 
client/user, is not of much value. The test-cases, therefore, test your 
submitted code with boundary conditions and checks for correct output. A 
test-case will *always* meet the input specification. It is your responsibility 
to ensure that your output meets the output specification. Do *not* output 
anything other than what is asked for. For every _System.out.println()_ you use, 
ask yourself whether it meets the output specification or not.

2. *Your z-score*: Predictability is an important part of being a good software 
   engineer. Given a problem, you should be able to predict how long it will 
take for you to completely solve it. The Engineer's Log tries to capture this 
notion by recording your own estimate of three tasks: (a) design, (b) code, and 
(c) test. Dividing your actual time by the estimated time for each task, gives 
you the velocity for each task. Your AverageVelocity for an assignment, is the 
average of the three velocities for that assignment. While this number is useful 
in isolation, it is even more useful to measure your AverageVelocity against 
your peers. This is done by calculating your 
[z-score](http://www.wikihow.com/Calculate-Z-Scores). The z-score allows us to 
know how students are performing, relative to each other.

3. *Your personal trend*:  The first few estimates are (effectively) random 
   guesses, unless you have estimated your own performance before. Since all the 
assignments will be of comparable complexity, you are effectively solving 
similar problems, again and again. This should allow you to get better estimates 
about your own performance. The more you practise estimation, the better you 
will get at it. Do not forget to use your previous estimates and actuals as 
guides for the next assignment. Over a period of time, your AverageVelocity will 
start to approach one (1). Calculating the trend of your AverageVelocity over 
multiple assignments measures how much you are improving in your estimation 
accuracy. This effectively measures you against your own previous performance. 

The individual assignment, therefore, evaluates you on three axes: (a) 
correctness, (b) performance vis-a-vis peers, ( c) performance vis-a-vis past 
performance

![Assignment Assessment Pattern](/images/cs3012/Assignment-Assessment-Pattern.png "The assessment pattern for cs3012")
<hr/>

##### Test Cases

The number of testcases may be different for each assignment, however your score 
will always be normalized to 5. That is, your maximum score will be five (5), if 
all test cases pass. The minimum score will be zero (0), if:<br/>

1. No test cases pass

2. Code does not compile (program does not run)

Your code will be compiled using the following command: <br/>
```
javac YourCode.java
```

Your code will receive input using the following command:<br/>
```
java YourCode < testinput1
```

<hr/>

##### Z-score

The _Average Velocity_ of an assignment is calculated as: <br/>
```
AverageVelocityOfStudent = (AverageVelocityOfDesign + AverageVelocityOfCoding + AverageVelocityOfTesting) / 3
```

After calculating the Average Velocity of each student, the arithmetic mean 
velocity and the standard-deviation of the entire class is calculated.

A student's _z-score_ = <br/>
```
(AverageVelocityOfStudent - ArithmeticMean)/standard-deviation
```

The _z-score_ is then bagged using the following rules: <br/>

1. More than 1-standard deviation *below* the mean ==> 5 <br/>

2. Between 1-standard deviation below mean and mean(incl. mean) ==> 4 <br/>

3. Up to 1-standard deviation *above* mean => 3 <br/>

4. More than 1-standard deviation *above* mean but less than 2-standard 
  deviations ==> 2 <br/>

5. 2-standard deviations and more *above* the mean ==> 1 <br/>

<hr/>

#### Personal Trend

A student's personal trendline is calculated as the best-fit straight line using 
the average velocities over all the assigments. The slope of this trendline 
shows the rate of change of AverageVelocity with continued assignments. All 
students should (ideally) have a negative slope, by the end of the course. The 
entire class' slope will be calculated at the end of the term, and the mean and 
standard deviation calculated. The marks for the slope will then be calculated 
using the bagging rules, that are as follows:

1. More than 1-standard deviation *below* the mean ==> 5 <br/>

2. Between 1-standard deviation below mean and mean(incl. mean) ==> 4 <br/>

3. Up to 1-standard deviation *above* mean => 3 <br/>

4. More than 1-standard deviation *above* mean but less than 2-standard 
  deviations ==> 2 <br/>

5. 2-standard deviations and more *above* the mean ==> 1 <br/>

<hr/>









