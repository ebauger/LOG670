//This file was generated from (Commercial) UPPAAL 4.0.14 (rev. 5615), May 2014

/*

*/
//NO_QUERY

/*

*/
A[] (v1.b imply v1.tempsDemandeSortie<=520)

/*

*/
A[] (v1.SurLePont imply not v4.SurLePont)

/*

*/
E<> v1.SurLePont and v2.SurLePont

/*

*/
modeA --> not modeA

/*

*/
A[] not deadlock
