# 메멘토 패턴 (Memento Pattern)

----


## 메멘토 패턴이란?
<blockquote> 
<p><strong>메멘토 패턴은 객체의 구현 세부 사항을 공개하지 않으면서 객체의 상태를 저장하거나 이해당 객체를 이전 상태로 복구할 수 있도록 해주는 디자인 패턴이다.  </strong></p> 
주로 "되돌리기(undo)" 기능이나 히스토리 기능을 구현할 때 유용하다.
</blockquote> 
<br>


### ➤ 메멘토 패턴의 구조 <br>

<table class="table">
<tbody>
<tr>
<td><strong>Originator</strong></td>
<td>객체의 상태를 저장하고 복구하는 역할을 담당하는 객체로, 자신의 상태를 메멘토로 저장하거나, 메멘토로부터 상태를 복원할 수 있다.
</tr>
<tr>
<td><strong>Memento</strong></td>
<td>Originator의 상태를 저장하는 역할로, 캡슐화를 유지하여 Originator 객체 외부에서는 상태에 직접적으로 접근할 수 없도록 제한한다.</td>
</tr>
<tr>
<td><strong>Caretaker</strong></td>
<td>Memento를 관리하는 역할로, Memento의 내부 구조나 데이터를 알지 못하며, 단지 일정한 순서대로 메멘토 객체를 저장하고 전달하는 역할을 수행한다.</td>
</tr>
</tbody>
</table> <br><br>


### ➤ 메멘토 패턴의 UML 다이어그램 <br>
![img.png](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FbfZuu6%2FbtrXrNa7jGm%2FN1jUqPURsvbiv8jCTyIwCK%2Fimg.png)

1. Caretaker
- Caretaker는 내부에 Memento 객체 type을 포함한다.(합성 관계)
- Caretaker는 Originator와 간접적으로 연결되며, 내부에 포함하고 있는 Memento 객체를 통해 Originator의 상태를 관리하지만 Originator의 상태에 직접적으로 관여하지는 않는다.
- Caretaker는 Originator와 Memento를 연결하며, Memento의 내부 세부 사항을 알지 못한 채 관리 역할만 담당한다.


2. Originator
- Originator는 현재의 상태를 가지고 있고, 해당 상태를 저장하거나 복원할 책임을 가진다.
- Originator는 Memento와 의존 관계를 가지며, createMemento 및 restore 메서드를 통해 Memento 객체와 상호작용한다.


3. Memento
- Memento는 Originator의 상태를 저장하는 역할만 한다.
- Memento는 Originator 객체를 통해서만 접근 가능한 immutable(불변의)한 객체로 일정 시점의 Originator 내부정보를 가지고 있다.


<br><br><br>
***




## 메멘토 패턴의 상세 흐름 <br>

### 상태 저장 (createMemento):

(1) Originator가 현재 상태를 캡슐화하여 Memento 객체를 생성한다. <br>
(2) Caretaker는 생성된 Memento 객체를 저장한다. <br>

<br>

### 상태 복원 (restore):

(1) Caretaker가 저장한 Memento 객체를 Originator로 전달한다. <br>
(2) Originator는 전달받은 Memento를 사용해 이전 상태로 복원한다. <br>


<br><br><br>
***



## 장점과 단점<br>


### ➤ 장점
- 이전 상태를 저장해 복구할 수 있으므로 소프트웨어에서 되돌리기/재실행 기능 구현에 적합하다.
- 상태 정보를 메멘토 객체를 통해 관리하므로 Originator의 내부 상태가 외부에 노출되지 않아 캡슐화가 유지된다.
- Caretaker는 상태에 대해 알지 못한 채로 관리에만 집중할 수 있다.


### ➤ 단점
- 상태 저장 시 많은 데이터가 포함된다면 메모리 사용량이 증가할 수 있다.
- 상태를 저장하고 관리하기 위한 코드가 증가할 수 있다.
- 복잡한 객체 상태를 저장할 때 설계와 구현이 어려워질 수 있다.

<br><br>


