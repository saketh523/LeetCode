public class DefangingIp {
        public String defangIPaddr(String address) {
            address = address.replaceAll("\\.","[.]");
            return address;
        }

    }
