#!/usr/bin/env bash

echo "Deployment Started!"

APK_PATH=$1

#APK_PATH=$app/build/outputs/apk/app-free-debug.apk

echo $APK_PATH

HOCKEYAPP_ACCESS_TOKEN='6acc6ee71e2541bf810c974b7e6cef8b'

echo $HOCKEYAPP_ACCESS_TOKEN
# token
HOCKEYAPP_APP_ID='746bd5458651410aab6c959ddf9e1bae'

echo $HOCKEYAPP_APP_ID

NOTES=$'app/release_notes.txt'

curl \
-F "status=2" \
-F "notify=2" \
-F "notes=$NOTES" \
-F "ipa=@$APK_PATH" \
-H "X-HockeyAppToken:$HOCKEYAPP_ACCESS_TOKEN" \
https://rink.hockeyapp.net/api/2/apps/$HOCKEYAPP_APP_ID/app_versions/upload

echo "Deployment finished!"