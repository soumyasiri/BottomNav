#!/usr/bin/env bash

echo "Deployment Started!"

APK_PATH=$1

echo $APK_PATH

HOCKEYAPP_ACCESS_TOKEN=$2

echo $HOCKEYAPP_ACCESS_TOKEN

HOCKEYAPP_APP_ID=$3

echo $HOCKEYAPP_APP_ID

curl \
-F "status=2" \
-F "notify=2" \
-F "ipa=@$APK_PATH" \
-H "X-HockeyAppToken:$HOCKEYAPP_ACCESS_TOKEN" \
https://rink.hockeyapp.net/api/2/apps/$HOCKEYAPP_APP_ID/app_versions/upload

echo "Deployment finished!"