# POINTCAL - Rating 83

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Point Calculation

Your favourite team participated in the recent FIFA World Cup, and in the group stages, they won $A$ games, drew $B$ games, and lost $C$ games.

How many points did your team score? A win is awarded $3$ points, a draw awarded $1$ point, and a loss $0$ points.

### Input Format
- The first and only line contains $3$ integers - $A$, $B$ and $C$.
### Output Format

Output the number of points won by your team.

### Constraints
- $0 \le A, B, C \le 3$
- $A + B + C = 3$
### Sample 1:
Input
Output

```
3 0 0

```

```
9
```

### Explanation:

Your team won all their $3$ games, hence making $3 \cdot 3 = 9$ points.

### Sample 2:
Input
Output

```
0 1 2

```

```
1

```

### Explanation:

Your team drew $1$ game and lost the others, thus $1$ point.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-09T17:07:40.275Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println((a*3)+(b*1));

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/POINTCAL)