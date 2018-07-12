package tw.core;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tw.core.model.Record;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


/**
 * Created by jxzhong on 2017/9/23.
 */
public class AnswerTest {
    private Answer actualAnswer;

    @BeforeEach
    public void setUp() {
        actualAnswer = Answer.createAnswer("1 2 3 4");
    }

    @Test
    public void should_createAnswer_is_execute_when_give_actual_answer()
    {
         assertThat(actualAnswer.getIndexOfNum("1"),is(0));
    }
    @Test
    public  void should_return_1A2B_the_actualAnswer_is_1_2_3_4_and_the_inputAnswer_is_2_3_4_5(){
        Answer inputAnswer =  Answer.createAnswer("2 3 5 4");
       String record = actualAnswer.check(inputAnswer).getValue();
      assertThat(record,is("1A2B"));

    }
    @Test
    public  void should_toSring_is_execute_when_give_actualAnswer(){
        assertThat(actualAnswer.toString(),is("1 2 3 4"));

    }

}