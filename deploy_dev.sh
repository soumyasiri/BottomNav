
HOCKEYAPP_RELEASE_NOTES =

curl \
-F "status=2" \
-F "notify=0" \
-F "notes=$H" \
-F "ipa=@BottomNav/build/outputs/apk/app-paid-release.apk" \
-H "X-HockeyAppToken: 131db32fee7b4f509455e29851d97d12" \
https://rink.hockeyapp.net/api/2/apps/2d8b61d5198a4c0293969a3e8c111d3a/1.0/upload