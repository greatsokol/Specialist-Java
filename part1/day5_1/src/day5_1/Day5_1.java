package day5_1;

class ListItem {
    String value;
    ListItem prev;
    ListItem next;
    ListItem(ListItem prev, ListItem next, String value) {
        this.prev = prev;
        this.next = next;
        this.value = value;
    }
}

class ListOfItems {
    ListItem first;
    ListItem last;
    int count;

    void addFirst(String value) {
        if (value==null) return;
        count++;
        if(first == null) {
            ListItem item = new ListItem(null, null, value);
            first = item;
            last = item;
        } else {
            ListItem item = new ListItem(null, first, value);
            first.prev = item;
            first = item;
        }
    }    
    
    void addLast(String value) {
        if (value==null) return;
        count++;
        if(first == null) {
            ListItem item = new ListItem(null, null, value);
            first = item;
            last = item;
        } else {
            ListItem item = new ListItem(last, null, value);
            last.next = item;
            last = item;
        }
    }
    
    void addLast(String ...values) {
        for(String item: values) {
            addLast(item);
        }
    }
    
    void addBefore(String value, ListItem next) {
        if (value==null || next==null) return;
        if (next == first) addFirst(value);
        else {
            ListItem item = new ListItem(next.prev, next, value);    
            if(next.prev!=null)next.prev.next = item;
            next.prev = item;
        }                
    }
    
    ListItem find(String value) {
        ListItem li = first;
        while(li != null) {
            if(value.equals(li.value)){
                return li;
            }
            li = li.next;
        }
        return null;
    }
    
    void removeFirst() {
        first = first.next;
        if(first!=null)first.prev = null;
        if(first==null)last=null;
    }

    void removeLast() {
        last = last.prev;
        if(last!=null)last.next = null;
        if(last==null)first=null;
    }
    
    void remove(ListItem item) {
        if(item == first){
            removeFirst();
        }
        if(item == last){
           removeLast();
        }
        if(item.prev != null){
           item.prev.next = item.next;
        }
        if(item.next != null){
           item.next.prev = item.prev; 
        }
        count--;
    }
    
    void remove(String value) {
        ListItem li = first;
        while(li != null){
            if(li.value.equals(value)){
                remove(li);
            }
            li = li.next;
        }
    }

    void remove(int index) {
        int counter = 0;
        ListItem li = first;
        while(li != null){
            if(counter == index){
                remove(li);
                return;
            }
            li = li.next;
            counter++;
        }
    }
    
    void printForward() {
        boolean printed = false;
        ListItem li = first;
        while(li!=null){
            printed = true;
            System.out.println(li.value);
            li = li.next;
        }
        if(!printed)System.out.println("empty list");
    }
    
    void printBackward() {
        boolean printed = false;
        ListItem li = last;
        while(li!=null){
            printed = true;
            System.out.println(li.value);
            li = li.prev;
        }
        if(!printed)System.out.println("empty list");
    }
}

public class Day5_1 {
    public static void main(String[] args) {
        ListOfItems list2 = new ListOfItems();
        list2.addLast("555");
        list2.printForward();
        list2.removeLast();
        list2.printForward();
        
        
        ListOfItems list = new ListOfItems();
        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4", "5", null, "6");
        list.addLast("4", "6");
        
        System.out.println("======= forward =======:");
        list.printForward();
        
        System.out.println("======= backward =======:");
        list.printBackward();
        
        System.out.println("======= remove 4 =======:");
        list.remove("4");
        list.printForward();
        
        System.out.println("======= remove 1 =======:");
        list.remove("1");
        list.printForward();
        
        System.out.println("======= remove 6 =======:");
        list.remove("6");
        list.printForward();

        System.out.println("======= search 5 =======:");
        ListItem found = list.find("5");
        System.out.printf("found: %s\n", found!=null ? found.value : "not found");
        
        System.out.println("======= remove 5 =======:");
        list.remove(found);
        list.printForward();
                
        System.out.println("======= add first =======:");
        list.addFirst("first");
        list.printForward();
        
        System.out.println("======= add 33,22,very first before 3,2,first =======:");
        
        list.addBefore("33", list.find("3"));
        list.addBefore("22", list.find("2"));
        list.addBefore("very first", list.find("first"));
        list.printForward();
        
        System.out.println("======= remove by index 1 (first) =======:");
        list.remove(1);
        list.printForward();
                
        System.out.println("======= remove first =======:");
        list.removeFirst();
        list.printForward();

        System.out.println("======= remove last =======:");
        list.removeLast();
        list.printForward();    
        
        
        
    }
}
