package model.pizza;

import model.order.Customer;

public class orders {
    public static int getOrder(Customer customer)
    {
        String name = customer.getName();
        int i = 0;
        switch (name)
        {
            case "Manasa":
            case "Amisha":
                i = 1;
                break;
            case "Akshi":
            case "Mahi":
                i = 2;
                break;
            case "Mayu":
                i = 3;
                break;
            case "Nikki":
                i = 0;
                break;
        }
        return i;
    }
}
