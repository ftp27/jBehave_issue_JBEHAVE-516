JBEHAVE-516
===========

Scenario-level tag is ignored by meta filter

~~~
I created the attached project which uses a very simple story with 2
scenarios. Each scenario has a different author. I would like to run
the scenario written by author A using
<metaFilters>
<metaFilter>+author A</metaFilter>
</metaFilters>
but that doesn't run any scenarios. Filtering with -author A works
fine. Attached project is self-contained and doesn't have any external
depdendencies. See maven details below.
Thanks,
Edgardo
Please, see further details and Mauro's analysis on:
~~~
