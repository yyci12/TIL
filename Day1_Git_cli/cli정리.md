# CLI

### 0.초기설정

> ``` bash
> git config --global user.name "유저명"
> ```
>
> 
>
> ``` bash
> git config --global user.email "깃허브 메일"
> ```
>
> 
>
> + 설정 값 확인 방법
>
> ```bash
> git config --global --list
> ```
>
> 

### 1. touch

> 파일을 생성하는 명령어 
>
> ```bash 
> touch test.c
> ```



### 2. mkdir

> 디렉토리를 생성하는 명령어 - Make directory의 줄임말
>
> ```bash
> mkdir test
> ```



### 3. ls

> 현재 경로의 파일 내역들을 확인하는 명령어 
>
> ```bash
> ls
> ```
>
> 숨김 폴더, 파일까지 확인하는 명령어 
>
> ```bash
> is -a
> ```



### 4. mv

> 파일을 이동하는 명령어 
>
> > 만약에 이동을 지시한 디렉토리가 없으면 이름이 변경된다



### 5. rm

> 삭제하는 명령어
>
> > 폴더를 삭제하기 위해서는? 
> >
> > ```bash
> > $ rm -r [디렉토리명]
> > ```



### 6. pwd

> 현재의 경로를 파악하는 명령어 
>
> >절대 경로로 나의 경로를 파악할 수 있다.
> >
> >```bash
> >$pwd
> >/c/Users/(Username)/Desktop
> >```
>
> + 절대경로 : /c/Users/student/Desktop/CLI
> + 상대경로 : .. (상위경로), .(현재경로)



## 7. start.

> 경로상의 gui 환경실행 (windows 기준 파일탐색기로 경로의 폴더창이 나타남)
>
> ~~~bash 
> start.
> ~~~



## 8. Git init

>1. 마스터 생성
>
>```bash
>yang@DESKTOP-3EMQVOA MINGW64 ~/Desktop/test
>$ git init
>Initialized empty Git repository in C:/Users/yang/Desktop/test/.git/
>```
>
>2. 마스터 생성확인
>
>```bash
>$ ls -a
>./  ../  .git/
>```



## 9. git add

>1. staging area
>
>  ```bash
>$ git add
>  ```
>
>2. 디렉토리내 모두 올리기
>
>```bash
>$ git add -a
>```



# 실습

>1. 폴더를 저장소로 만들기
>
>```bash
>yang@DESKTOP-3EMQVOA MINGW64 ~/student
>$ git init
>Initialized empty Git repository in C:/Users/yang/student/.git/
>
>yang@DESKTOP-3EMQVOA MINGW64 ~/student (master)
>$ touch README.md
>```
>
>
>
>2. Staging area
>
>```bash
>$ git add README.md
> or 
>$ git add .
>```
>
>
>
>3. 파일의 상태확인
>
>``` bash
>$ git status
>On branch master
>
>No commits yet
>
>Changes to be committed:
>(use "git rm --cached <file>..." to unstage)
> new file:   README.md
>```
>
>
>
>4. 변경사항 기록 (commits)
>
>```bash
>$ git commit -m "frist commit"
>```
>
>
>
>5. 변경사항확인
>
>```bash
>$ git log
>commit 177ca1acca14ba5d1c71b2b45c2bc7e962f3c7cd
>Author: yyci12 <yyci@naver.com>
>Date:   Wed Apr 13 14:30:32 2022 +0900
>
>frist commit
>```
>
>>또는
>>
>>```bash
>>git log --oneline
>>```
>
>
>
# GIThub 연결후 커밋하기

1. github에서 new repository 만들기



 2. ![image-20220413162847537](https://user-images.githubusercontent.com/38197124/163128666-7f1203f1-1cbe-4186-845a-0755d42f424f.png)

    * 복사 후 bash에 입력

      ```bash
      git remote add origin https://github.com/yyci12/TIL.git
      ```

 3. 연결확인

    ```bash
    $ git remote -v
    ```

4. 커밋

   ```bash
   $ git commit -m "first commit"
   ```

5. Status

   ```bash
   $ git status
   ```

6. Push

   ```bash
   $ git push origin master
   ```

7. 업로드 확인

   ```bash
   $ git log --oneline
   ```

8. 업로드 완료

   ![image](https://user-images.githubusercontent.com/38197124/163133572-210b2d4e-c5a0-4826-8bce-2e2c8c65e9a8.png)

