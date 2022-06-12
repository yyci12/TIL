# 스스로 학습 하는 REACT

## REACT?

> REACT란?

- "React" 는 facebook.com의 UI를 더 잘 만들기 위해서 페이스북에서 만든 Javascript UI 라이브러리.
- https://reactjs.org/

- https://github.com/facebook/create-react-app



## **컴포넌트** 

사용자 정의 태그를 만들어주는 여러가지 기술중 하나이다.

```html
<body>
    <top></top> //사용자 정의 태그
    <side></side> //사용자 정의 태그
</body>
```

리엑트에서는 위와 같은 사용자가 정의한  태그를 사용한다. 이를 **컴포넌트**라 부른다



#### 장점

- 컴포넌트를 작성하면 **가독성**을 획기적으로 높일 수 있다.

- **재사용성**이 높아진다.

- 만약 top.html이란 파일에서 버그가 있거나 개선을 해야되는 경우에도 top.html 의 변경된 내용이 파일을 사용하고 있는 모든 태그들에서 

  동시 다발적으로 업데이트가 일어나  **유지보수**가 훨씬 더 편리해진다는 폭발적인 효과를 제공한다.



## Install

- https://nodejs.org/en/

> **"LTS"** 라고 되어있는 것은 안정화된 버전, **"current"** 라고 되어 있는 것은 가장 최신 버전 



- 설치확인

~~~bash
cmd> node -v
cmd> npm -v
~~~



- **create-react-app 설치**

```bash
npm install -g create-react-app
```



* 설치확인

```bash
create-react-app -V
```



## **NPM vs NPX**

공식메뉴얼에서는 **"npx"** 라는 도구를 이용해서 설치하라고 되어있고,

**"npx create-react-app"** 명령어를 통해 설치를 진행할 수도 있다.

 

**"npm" 과 "npx" 의 차이**는 **npm**이 프로그램을 설치하는 프로그램이라면

**npx**는 프로그램을 임시로 설치해서 딱 한번만 실행시키고 지우는 프로그램이라고 생각하면된다.

npx의 **장점**은 "컴퓨터의 공간을 낭비하지 않는다." , "실행할 때마다 다운로드를 새로 받기 때문에 항상 최신상태이다." 라는 장점이 있다.



## 개발 환경 설정

``` bash
cd 파일경로(파일경로를 모르면 폴더 아이콘을 드래그하면 자동으로 경로설정이됨)
create-react-app .
```

디렉토리로 이동 후 **" create-react-app . "** 명령을 실행합니다. **점(.)**은 현재 디렉토리라는 뜻



## 샘플 웹 앱 실행 

1. 실행

``` bash
npm run start
```

 	2. 종료

```bash
ctrl+c
```



## 배포 환경 만들기

1. bulid

```bash
npm run build
```

> 1. 명령을 사용하여 디렉토리 구조에 **"build"**라고 하는 파일이 추가
> 2. "build" 디렉토리 안에 있는 "index.html" 파일은 **공백이 하나도 없는 상태**

2. serve

```bash
npm install -g serve
serve -s build
```

> **"-s build"** 옵션은 build라는 디렉토리를 document root로 하는 옵션

