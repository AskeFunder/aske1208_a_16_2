package SorteOpgaver.ch16.aske1208_a_16_2;

import SorteOpgaver.ch16.LinkedIntList;
import SorteOpgaver.ch16.ListNode;

import java.util.NoSuchElementException;

public class two
{
    public int max(LinkedIntList linkedIntList)
    {
        int maxValue = 0;
        ListNode current = linkedIntList.getFront();

        if (current.next == null)
        {
            throw new NoSuchElementException();
        }else {

            for (int i = 0; i < linkedIntList.size(); i++)
            {
                if (current.data > maxValue)
                {
                    maxValue = current.data;
                }
                current = current.next;
            }
        }
        return maxValue;
    }
}
