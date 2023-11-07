/*second highest salary of employee table*/
SELECT *FROM EMPLOYEE ORDER BY SALARY DESC;

SELECT NAME, COUNT(NAME) AS REPEATED FROM STUDENT GROUP BY NAME;

/*Write a SQL query to find out the overall friend acceptance rate for each day.
- - friend_request: ds(date Stamp)  | sender  | receiver | action (sent, accepted, rejected etc)
  -- ds | friend_accepted_rate ->  (accepted / total ) * 100

  */
  SELECT DS, ROUND( COUNT(CASE WHEN ACTION == 'ACCEPTED' THEN 1
      ELSE NULL END) * 1.00 / COUNT(ACTION ) * 100 AS PERC_ACCPETANCE, 2)
  FROM FRIEND_REQUEST GROUP BY 1;

SELECT 1, COUNT(ID) FROM EMP GROUP BY ID HAVING COUNT(ID) > 1; /*get duplicate records from emp table having using id*/

/*Duplicate Values in Multiple Columns*/

SELECT MAX(SALARY) FROM EMPLOYEE WHERE SALARY <
(SELECT MAX(SALARY) FROM EMPLOYEE ORDER BY SALARY DESC);

SELECT SALARY FROM
(SELECT DISTINCT SALARY FROM EMPLOYEE ORDER BY DESC LIMIT 2) AS ORDER BY SALARY LIMIT 1;


/*Delete Duplicate rows in SQL*/

WITH EMPLOYEECTE AS (
    SELECT *, ROW_COUNT
)
