## Git 기초 실습 - 문제풀기

> 아래에 있는 각각의 문제에 대해 답과 이유를 작성하시오.
> 한 문제를 풀 때 마다 커밋을 저장하시오. 커밋 메시지는 "solve 문제번호 problem"의 형태로 저장하시오.



### 1. Git과 Github는 같다. (맞으면 O, 틀리면 X)

   - 답 : X
   - 이유 : git은 로컬에서 사용되는 버전 관리시스템 github는 클라우드 방식으로 관리되는 버전관리 시스템이다.
      - git = 로컬 방식
      - github = 클라우드 기반 방식
   
### 2. 터미널 명령어 `cd .`은 현재 위치의 부모 폴더로 이동하라는 의미이다. (맞으면 O, 틀리면 X)

   - 답 : X
   - 이유 : 현재위치 <-> .. = 상위폴더 
   - 상위폴더로 이동하는 명령어이다.



### 3. 마크다운 문법에서 글씨의 크기를 키우고 싶다고해서 본문을 제목으로 지정하면 안된다. (맞으면 O, 틀리면 X)
   - 답 : O
   - 이유 :  구분선이 생기므로 ```<span style="font-size:250%">폰트사이즈 250</span>  ``` 로 조정해야한다.



### 4. Git의 3가지 공간에는 Working Directory, Staging Area, Commits이 있다. (맞으면 O, 틀리면 X)
   - 답 :O
   - 이유 :
   - Working Directory : 내가 작업하고 있는 프로젝트의 디렉토리
   - Staging Area : 커밋을 하기 위해 $ git add 명령어로 추가한 파일들이 모여있는 공간
   - Repository : 커밋들이 모여있는 저장소
   
   >![img](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FmtzJ7%2Fbtq9PUXFlUj%2FNAqKtGV9XIWHwhA1fq7BY1%2Fimg.png)
   
### 5. Commit ID는 중복 가능하다. (맞으면 O, 틀리면 X)
   - 답 : O
   - 이유 :  중복은 불가능하다 .  고유한 해쉬코드값으로 넘겨받기때문.
   ![image](https://user-images.githubusercontent.com/38197124/163130544-e11d314d-da88-4084-9698-16dc48681e3f.png)