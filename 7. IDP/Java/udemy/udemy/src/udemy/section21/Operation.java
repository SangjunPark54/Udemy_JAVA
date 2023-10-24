package udemy.section21;

    /*
이번 예제에서 우리는 수학 연산 앱을 만들려고 합니다. 이 앱은 덧셈, 뺄셈, 나눗셈 같은 기초 연산을 수행할 수 있어야 합니다.
우리에게는 2개의 정수를 인수로 받아서 정수를 리턴하는 perform메서드와 Operation 인터페이스가 제공되어 있습니다.
우리의 목표는 Operation인터페이스를 구현하고 그것의 구체적인 구현물인
perform메서드를 제공하는 3개의 클래스 Add, Subtract, Divide를 구현하는 것입니다.
그렇지만 주의할 점이 하나 있습니다. 나누기를 할 때 분모가 0이면 여러분의 프로그램은 -1을 리턴하여 오류를 표시해야 합니다.
입력 형식
perform메서드의 입력값은 2개의 정수 값인 x와 y일 것입니다.
출력 형식
perform메서드의 출력값은 x와 y에 해당되는 연산을 수행한 결과인 정수가 되어야 합니다.
지침
perform메서드를 구현하여 Add클래스를 완성합니다. 이 메서드는 x와 y를 더한 결과를 리턴해야 합니다.
perform메서드를 구현하여 Subtract클래스를 완성합니다. 이 메서드는 y를 x에서 뺀 결과를 리턴해야 합니다.
perform메서드를 구현하여 Divide클래스를 완성합니다. 이 메서드는 x를 y로 나눈 결과를 리턴해야 합니다.
그러나 나누기를 수행하기 전에 y가 0인지 검사합니다. 만일 y가 0이라면 -1을 리턴합니다.
     */
public interface Operation {
    int perform(int x, int y);
}
class Add implements Operation {
    @Override
    public int perform(int x, int y) {
        return x + y;
    }
}

class Subtract implements Operation {
    @Override
    public int perform(int x, int y) {
        return x - y;
    }
}

class Divide implements Operation {
    @Override
    public int perform(int x, int y) {
        if(y==0) {
            return -1;
        } return x / y;
    }
}

