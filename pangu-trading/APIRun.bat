@echo off

REM set MAVEN_OPTS environment
REM set MAVEN_OPTS=-Xms128m -Xmx1024m -XX:PermSize=64m -XX:MaxPermSize=640m
REM install Helper project
cd Helper
cmd /c mvn eclipse:clean eclipse:eclipse
if not "%errorlevel%"=="0" goto :end
cmd /c mvn clean install -Dmaven.test.skip=true
if not "%errorlevel%"=="0" goto :end
REM generate TestProject
cmd /c mvn api:genTests -U
if not "%errorlevel%"=="0" goto :end
cd ..
REM run TestProject tests
cd TestProject
cmd /c mvn clean test
cd ..
rd /S /Q Report 2>nul
mkdir Report
copy TestProject\target\surefire-reports\html\* Report

:end
pause