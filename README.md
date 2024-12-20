# Network Programming Workshops

This repository contains the workshops conducted as part of the **Network Programming** module. Each workshop focuses on different aspects of network programming, demonstrating practical implementations and hands-on examples.

---

## Workshop 1: Chat Application Using Socket Programming (Java)

### **Overview**
In the first workshop, we developed a simple **Chat Application** using **socket programming** in Java. This application allows multiple clients to connect to a server and exchange messages in real time. But for the sake of time I created only one cleint.

---

### **Features**
- **Client-Server Architecture**: The application uses a single server to manage multiple clients.
- **Real-time Communication**: Clients can send and receive messages in real time.


---

### **How It Works**
1. **Server**: Listens on a specified port for incoming client connections.
2. **Client**: Connects to the server using the server's IP and port.
3. **Communication**: Messages sent by any client are broadcasted to all connected clients.

---

### **Technologies Used**
- **Java Programming Language**
- **Socket Programming** (Java `Socket` and `ServerSocket` classes)

---

### **How to Run**

#### **Prerequisites**
- Install the **Java Development Kit (JDK)** on your system.

#### **Steps**
1. Clone the repository:
   ```bash
   git clone https://github.com/nostoc/network-programming.git
