//This file was generated from (Commercial) UPPAAL 4.0.14 (rev. 5615), May 2014

/*

*/
//NO_QUERY

/*

*/
A[] (v1.SurLePont imply v1.tempsDemandeSortie<=300)

/*

*/
A[] (vBP.SurLePont imply not (vA.SurLePont or vAP.SurLePont))

/*

*/
E<> v1.SurLePont and v2.SurLePont

/*

*/
modeA --> not modeA

/*

*/
A[] not deadlock
