# JPandas

JPandas is an implementation of [Pandas (Python Data Analysis Library)](http://pandas.pydata.org/) on java.

In data science fields, We often use Python or R.
Because these language offers some useful function for analyzing data.
DataFrame is one of the powerful data structure for that.

If we implement result of analysis to real application (for example android app), JPandas helps it.


## Tutorial

#### Define DataFrame

```
DataFrame<String, Series> df = new DataFrame<String, Series>();

df.put("feature_a", new Series<Double>(3.0, 8.0, 2.0, ...));
df.put("feature_b", new Series<Integer>(4, 6, 10, -2, ...));
:
:
```

#### methods

This library offers useful methods like pandas.

- mean

```
df.mean()
// Output
//                a          b          c          d          e
// mean    0.321200  -0.331797  -0.030067   0.298881  -0.002687
```

```
df.mean().get('a')
// Output
//                a
// mean    0.321200
```

- std

```
df.std()
// Output
//               a          b          c          d          e
// std    0.321200  -0.331797  -0.030067   0.298881  -0.002687
```

```
df.std().get('a')
// Output
//               a
// std    0.321200
```

- describe

```
df.describe()

// Output
//                a          b          c          d          e
// count  10.000000  10.000000  10.000000  10.000000  10.000000
// mean    0.321200  -0.331797  -0.030067   0.298881  -0.002687
// std     0.982764   0.782483   1.318384   0.774907   1.324976
// min    -1.571542  -1.374674  -1.682764  -0.573934  -2.005993
// 25%     0.144444  -0.842716  -0.969695  -0.274428  -1.205816
// 50%     0.399115  -0.626424  -0.130309   0.296615   0.237664
// 75%     0.714873   0.307824   0.365205   0.346391   0.938685
// max     1.742534   1.048565   2.725946   1.858966   1.657750
```

```
df.describe().get('a')

// Output
//                a
// count  10.000000
// mean    0.321200
// std     0.982764
// min    -1.571542
// 25%     0.144444
// 50%     0.399115
// 75%     0.714873
// max     1.742534
```

## LICENSE

```
Copyright 2015 Masashi Shibata

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
