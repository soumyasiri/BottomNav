#!/usr/bin/env bash

echo "Deployment Started!"

#$CIRCLE_ARTIFACTS/app/outputs/apk/app-debug.apk

APK_PATH=$CIRCLE_ARTIFACTS/app/outputs/apk/app-paid-release.apk
#APK_PATH=$app/build/outputs/apk/app-paid-release.apk

echo $APK_PATH

HOCKEYAPP_ACCESS_TOKEN=$131db32fee7b4f509455e29851d97d12

#HOCKEYAPP_ACCESS_TOKEN=$2

echo $HOCKEYAPP_ACCESS_TOKEN

HOCKEYAPP_BOTTOMNAV_RELEASE_APP_ID=$2d8b61d5198a4c0293969a3e8c111d3a
#HOCKEYAPP_BOTTOMNAV_RELEASE_APP_ID=$3

echo $HOCKEYAPP_BOTTOMNAV_RELEASE_APP_ID

curl \
-F "status=2" \
-F "notify=1" \
-F "notes=AA" \
-F "ipa=@$APK_PATH" \
-H "X-HockeyAppToken:$HOCKEYAPP_ACCESS_TOKEN" \
https://rink.hockeyapp.net/api/2/apps/$HOCKEYAPP_BOTTOMNAV_RELEASE_APP_ID/app_versions/upload

echo "Deployment finished!"