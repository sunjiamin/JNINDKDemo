//
// Created by Jiamin.Sun on 6/30/2016.
//
#include <sys/types.h>
#include <unistd.h>
//#define _GNU_SOURCE
#include <stdlib.h>
#include <stdio.h>
#include <string.h>
# include "com_xinws_ndkjnidemo_ndk_NdkUtils.h"

JNIEXPORT jstring JNICALL Java_com_xinws_ndkjnidemo_ndk_NdkUtils_getStringFormC
        (JNIEnv *env, jobject obj){

    return (*env)->NewStringUTF(env, "这里是来自c的string");
}

