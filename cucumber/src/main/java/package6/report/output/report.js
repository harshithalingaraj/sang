$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:package6/data.feature");
formatter.feature({
  "name": "To test number of fruits",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "To check the number of fruits",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "There are \"\u003cstart\u003e\" friuts",
  "keyword": "Given ",
  "rows": [
    {
      "cells": [
        "type",
        "with"
      ]
    },
    {
      "cells": [
        "apples",
        "me"
      ]
    },
    {
      "cells": [
        "oranges",
        "sangee"
      ]
    }
  ]
});
formatter.step({
  "name": "I eat \"\u003ceat\u003e\" fruits",
  "keyword": "When "
});
formatter.step({
  "name": "I have \"\u003cleft\u003e\" fruits",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "start",
        "eat",
        "left"
      ]
    },
    {
      "cells": [
        "12",
        "5",
        "7"
      ]
    },
    {
      "cells": [
        "10",
        "7",
        "3"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To check the number of fruits",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "There are \"12\" friuts",
  "rows": [
    {
      "cells": [
        "type",
        "with"
      ]
    },
    {
      "cells": [
        "apples",
        "me"
      ]
    },
    {
      "cells": [
        "oranges",
        "sangee"
      ]
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "Data.ab(String,DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I eat \"5\" fruits",
  "keyword": "When "
});
formatter.match({
  "location": "Data.bc(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have \"7\" fruits",
  "keyword": "Then "
});
formatter.match({
  "location": "Data.cd(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To check the number of fruits",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "There are \"10\" friuts",
  "rows": [
    {
      "cells": [
        "type",
        "with"
      ]
    },
    {
      "cells": [
        "apples",
        "me"
      ]
    },
    {
      "cells": [
        "oranges",
        "sangee"
      ]
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "Data.ab(String,DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I eat \"7\" fruits",
  "keyword": "When "
});
formatter.match({
  "location": "Data.bc(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have \"3\" fruits",
  "keyword": "Then "
});
formatter.match({
  "location": "Data.cd(String)"
});
formatter.result({
  "status": "passed"
});
});