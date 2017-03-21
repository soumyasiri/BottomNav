#!/usr/bin/env bash

echo "Deployment Started!"

APK_PATH=$1

#APK_PATH=$app/build/outputs/apk/app-free-debug.apk

echo $APK_PATH

HOCKEYAPP_ACCESS_TOKEN=$'131db32fee7b4f509455e29851d97d12'

echo $HOCKEYAPP_ACCESS_TOKEN
# token
HOCKEYAPP_APP_ID=$'2d8b61d5198a4c0293969a3e8c111d3a'

echo $HOCKEYAPP_APP_ID

curl \
-F "status=2" \
-F "notify=2" \
-F "ipa=@$APK_PATH" \
-H "X-HockeyAppToken:$HOCKEYAPP_ACCESS_TOKEN" \
https://rink.hockeyapp.net/api/2/apps/$HOCKEYAPP_APP_ID/app_versions/upload

echo "Deployment finished!"