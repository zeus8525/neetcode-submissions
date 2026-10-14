class TimeMap {

        Map<String, List<Node>> map;

        public TimeMap() {
            map = new HashMap<>();
        }

        public void set(String key, String value, int timestamp) {
            map.putIfAbsent(key,new ArrayList<Node>());
            map.get(key).add(new Node(timestamp,value));
        }

        public String get(String key, int timestamp) {
            if(!map.containsKey(key)) return "";
            String res = "";
            List<Node> list = map.get(key);
            int i=0,j=list.size()-1;

            while(i<=j){
                int mid = (i+j)/2;
                Node next = list.get(mid);
                if(next.timestamp > timestamp){
                    j = mid - 1;
                }else{
                    res = next.value;
                    i = mid + 1;
                }
            }
            return res;
        }

        static class Node {
            public int timestamp;
            public String value;

            public Node(int timestamp, String value){
                this.timestamp = timestamp;
                this.value = value;
            }
        }
    }