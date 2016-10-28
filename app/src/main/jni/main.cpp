//
// Created by BigRun on 2016/9/25.
//

#include <com_example_ndktest_Load.h>

JNIEXPORT jint JNICALL Java_com_example_ndktest_Load_addInt
        (JNIEnv *, jobject, jint a, jint b){
return a+b;
}