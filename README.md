# 서버관리솔루션즈

<img src="https://github.com/vulpera-fox/stms/assets/133090074/3c63c4a8-b85f-48e9-a88f-91b99159e62f" />

개발 인원  : 5명
개발 기간  : 8 월 21일 ~ 9월 25일
구현 기능 : 회원가입 | 로그인 | **권한별 Q&A CRUD** | **새소식 CRUD** | **내 문의 CRUD** |  작업 조회 및 등록 
                  템플릿 생성 | **권한별 레이아웃** | **메인페이지 UI**

## 1. 프로젝트 개요

## 1-1. 기획 의도
<aside>
IT 산업의 발전으로 인해 서버의 수가 증가함에 따라 서버 관리의 중요성이 더 커지고 있습니다. 
이에 중앙 서버 솔루션즈가 만든 서비스로 서버 관리의 복잡성을 줄이고, 
전문 엔지니어를 관리하는 관리자와 전문 엔지니어를 배치함으로써 장애 발생 시 대응시간을 단축하고, 전문성을 향상시키려는 목적으로 저희만의 중앙 서버 솔루션 서비스를 개발하고자 합니다.

## 1-2. 개발 목표

<aside>
서버 관리 프로세스를 통일화함으로써 서버 관리의 효율성과 생산성 향상에 도움이 될 수 있는 서비스를 개발하는 것이 목표입니다.
</aside>

## 2. 요구사항 정의서

<img src="https://github.com/vulpera-fox/stms/assets/133090074/43698d63-7fcc-49c6-908a-196aea84514e)" />
<aside>
요구사항 정의서를 처음으로 작성해보면서 어떤 기능들을 구현해야할지 목록화 할 수 있었고, 기능별 중요도를 상,중,하로매겨 우선순위대로 프로젝트를 진행 할 수 있었습니다. 또한 팀원간 회의를 통해 기능별 필수값을 지정해놓아 기능 구현 시 일관성 있게 작업할 수 있었습니다. 이러한 문서 작업을 통해 프로젝트에 대한 이해를 더 높일 수 있는 경험을 하였습니다.

</aside>

## 3. 사용 기술 스택

<img src="https://github.com/vulpera-fox/stms/assets/133090074/a0c0543f-917c-4201-837c-9c23899b8cce" />

## 4. ER 다이어그램

<img src="https://github.com/vulpera-fox/stms/assets/133090074/1a42a520-1ac0-4cd7-864e-4d707fc8d49e" />

## 5. UI 및 기능 구현

### #권한별 메인페이지 UI - 전체 접근 / 회원

<img src="https://github.com/vulpera-fox/stms/assets/133090074/ad1b8c88-f57f-4121-a62c-b8b91cb22175" />

<aside>

전체 접근이 가능한 메인 페이지화면입니다.

조회 가능한 메뉴로는 Home | Q&A | 새소식 탭입니다.
하지만 회원이 아니라면 글 작성 기능은 제한됩니다.

회원 권한으로 로그인 시, 조회 가능한 메뉴로는 
Home | 작업 관리 (서버 등록, 일정 조회, 프로젝트 신청) | Q&A | 새소식 탭입니다.

</aside>

### #권한별 메인페이지 UI - 관리자

<img src="https://github.com/vulpera-fox/stms/assets/133090074/620d5d3f-f0b0-4f1d-8a46-c19399fc4df5" />

### #권한별 메인페이지 UI - 엔지니어

<img src="https://github.com/vulpera-fox/stms/assets/133090074/4feae3cd-4aaa-4849-b949-c26f37b18b56" />

<img src="https://github.com/vulpera-fox/stms/assets/133090074/40d866c6-4179-4bfe-9192-1feb5fd23d89" />

<aside>

로그인 시 preHandle Intercepter를 이용해 권한을 확인한 후, 그에 맞는 경로설정을 해주었습니다. 또한 thymeleaf 문법을 활용하여 권한별 뷰를 다르게 처리해주었습니다.

</aside>

### #Q&A 게시판 UI / 기능 ( 1 )

<img src="https://github.com/vulpera-fox/stms/assets/133090074/009f0505-9905-4209-a981-4166c8d81e61" />

<aside>

**[ 구현 기능 ]**

- 총 게시물 수 (현재 페이지 번호 / 총 페이지 개수)
- 제목 or 내용 검색 기능
- Q&A 게시글 리스트 조회
- Q&A 게시글 상세보기
- Q&A 게시글 페이징
</aside>

### #Q&A 게시판 UI / 기능 ( 2 )

<img src="https://github.com/vulpera-fox/stms/assets/133090074/e9eba7ff-5ebd-4186-b735-61b4d66e79de" />

<aside>

**[ 구현 기능 ]**

- Q&A 게시글 비밀글 기능
- Q&A 게시글 조회수
- Q&A 게시글 작성 (회원)
</aside>

### #Q&A 게시판 UI / 기능 ( 3 )

<img src="https://github.com/vulpera-fox/stms/assets/133090074/359caad2-cc22-447a-899f-18082103e93f" />

<aside>

**[ 구현 기능 ]**

- Q&A 내용 작성
- Q&A 작성글 비밀글 설정
- Q&A 작성글 새로고침
</aside>

### #Q&A 게시판 UI / 기능 ( 4 )

<img src="https://github.com/vulpera-fox/stms/assets/133090074/22d5cc48-d0f9-4b5b-9391-57b01cbde318" />

<aside>

**[ 구현 기능 ]**

- Q&A 수정 기능 (작성자)
- Q&A 삭제 기능 (작성자)
- Q&A 목록으로 돌아가기 (비회원 및 작성자 외)
</aside>

### #새 소식 게시판 UI / 기능 ( 1 )

<img src="https://github.com/vulpera-fox/stms/assets/133090074/aac7b5a5-6d3b-4f4f-904d-5f54cf8b2b08" />

<aside>

**[ 구현 기능 ]**

- 총 게시물 수 (현재 페이지 번호 / 총 페이지 개수)
- 제목 or 내용 검색 기능
- 새 소식 게시글 리스트 조회
- 새 소식 게시글 상세보기
- 새 소식 게시글 페이징
</aside>

### # 새 소식 게시판 UI / 기능 ( 2 )

<img src="https://github.com/vulpera-fox/stms/assets/133090074/cd49c78b-178d-4094-8c82-135d0e3f9e46" />

<aside>

**[ 구현 기능 ]**

- 이전글 / 다음글
- 전체 목록으로 돌아가기
</aside>

<img src="https://github.com/vulpera-fox/stms/assets/133090074/57080f10-4f31-4071-9316-8306a0d52eec" />

<img src="https://github.com/vulpera-fox/stms/assets/133090074/634cee2e-c34b-442f-8541-14fb9ee0b739" />

<aside>

동적 쿼리와 서브쿼리를 이용하여 이전글과 다음글을 구현하였습니다.
맨 처음 글일 경우와 맨 마지막 글일 경우에는  ‘이전글이 존재하지않습니다' 문구와 ‘다음글이 존재하지않습니다' 뷰 처리도 함께 해주었습니다.

</aside>

---

### #내 문의 게시판 UI / 기능 ( 1 )

<img src="https://github.com/vulpera-fox/stms/assets/133090074/a32b2aa7-9ac9-4ed2-8be5-ded7aacf5946" />

<aside>

[ 내 문의 ] 버튼을 누르면 해당 아이디로 작성했던 문의글과
해당 문의글의 답변글만 모아서 조회 가능합니다.

</aside>

---

### #관리자 권한 문의 게시판 UI / 기능 ( 1 )

<img src="https://github.com/vulpera-fox/stms/assets/133090074/0b1b5ce0-2817-4b10-a631-ea1cba2c5f42" />

<aside>

Thymeleaf를 사용하여 관리자 계정의 문의 게시판 레이아웃을 다르게 처리하였고,
회원 문의 게시판과 동일하게 전체 리스트 조회와 페이징, 검색기능 등을 구현하였습니다.

</aside>

### #관리자 권한 문의 게시판 UI / 기능 ( 2 )

<img src="https://github.com/vulpera-fox/stms/assets/133090074/9ae94821-90f8-4156-a177-82c1683aab44" />

<aside>

**[ 구현 기능 ]**

- 해당 게시글에 대하여 답변 달기
: 답글 구현하기위해 여러 시행착오가 있었는데 테이블 컬럼에 ‘글 단계’와 ‘답글 순서’
항목을 추가하고,  ifnull이라는 내장함수를 이용하여 원글과 답글리스트를 순서에 맞게 조회 할 수 있습니다.
- 해당 게시글 삭제 기능
- 전체 목록으로 돌아가기
</aside>

### #관리자 권한 문의 게시판 UI / 기능 ( 3 )

<img src="https://github.com/vulpera-fox/stms/assets/133090074/bb8091f0-cfc3-4f0e-bd5c-c446406c9e0f" />

<aside>

답변달기 버튼을 클릭하면 해당 글의 제목, 비밀글 설정 여부와 비밀번호의 입력값은 그대로 유지되어 표출됩니다.

</aside>

## 6.  소감 및 후기

> github를 사용하여 이전보다 훨씬 더 수월하게 팀원들의 코드를 통합할 수 있었고, 효율적인 협업을 할 수 있음을 느낄 수 있어서 좋았습니다.
> 
> 
> 값을 컨트롤러로 보내기위해 <input=“hidden” > 태그를 사용했었는데 이 경우, 클라이언트가 해당 값을 다 볼 수있다는 점에서 보안 이슈가 발생하므로 좋지 못한 코드라는걸 알게되었습니다. 이러한 점에서 왜 Ajax를 사용해야하는지 알게되는 계기가 되었습니다.
> 
> 기술 스택을 선택할 때 Thymeleaf 문법과 Springboot를 좀 더 심도있게 사용해보고싶어서 리액트를 선택하진않았지만, 다음 프로젝트를 한다면 코드의 재사용성을 높이고, JSX문법을 사용하는 리액트를 사용해서 만들어보고싶습니다.
> 
> 여러 게시판을 스스로 만들고, AWS를 이용하여 배포까지 담당해보면서 개인적인 자신감을 많이 얻을 수 있었던 프로젝트였습니다. 앞으로도 계속 배운 기술들을 활용하고, 새로운 기술들을 익혀 많은 사용자들이 이용할 수 있게끔 더 탄탄한 서비스들을 만들어 배포할 계획입니다.
> 

## 7. notion 주소
https://quaint-fir-41c.notion.site/fb8e8b4193d949d09546bca96d1e55db?pvs=4
