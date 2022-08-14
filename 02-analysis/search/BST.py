class Node:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None
    
    def get(self):
        return self.value
    
    def set(self, value):
        self.val = value
        
    def getChildren(self):
        children = []
        if(self.left != None):
            children.append(self.left)
        if(self.right != None):
            children.append(self.right)
        return children
        
    def children_count(self):
        """
        Returns the number of children
        @returns number of children: 0, 1, 2
        """
        cnt = 0
        if self.left:
            cnt += 1
        if self.right:
            cnt += 1
        return cnt

    def inorder(self):
        ''' For Inorder traversal of the BST '''
        if self:
            if self.left:
                self.left.inorder()
            print(str(self.value), end = ' ')
            if self.right:
                self.right.inorder()


    def findMin(self, node):
       current = node
       while(current.left is not None):
            current = current.left

       return current


    def delete(self, key):
        """ 
        delete the node with the given key and return the 
        root node of the tree  
        """

        if self is None:
           return None

        if self.value > key:       
           self.left = self.left.delete(key)
        elif self.value < key:    
           self.right = self.right.delete(key)
        else:
            if self.left is None:
                temp = self.right
                self = None
                return temp
            elif self.right is None:
                temp = self.left
                self = None
                return temp

            temp = self.findMin(self.right)
            self.value = temp.value
            self.right = self.right.delete(temp.value)

        return self


class BST:
    def __init__(self):
        self.root = None

    def setRoot(self, val):
        self.root = Node(val)

    def getRoot(self):
        return self.root

    def insert(self, value):
        if(self.root is None):
            self.setRoot(value)
        else:
            self._insertNode(self.root, value)

    def _insertNode(self, currentNode, val):
        if(val <= currentNode.value):
            if(currentNode.left):
                self._insertNode(currentNode.left, val)
            else:
                currentNode.left = Node(val)
        elif (val > currentNode.value):
            if(currentNode.right):
                self._insertNode(currentNode.right, val)
            else:
                currentNode.right = Node(val)

    def find(self, val):
        return self._findNode(self.root, val)

    def _findNode(self, currentNode, val):
        if(currentNode is None):
            return False
        elif(val == currentNode.val):
            return True
        elif(val < currentNode.val):
            return self._findNode(currentNode.left, val)
        else:
            return self._findNode(currentNode.right, val)

    def get_min(self, node):
        '''Get the minimum value.'''
        while node.left != None:
            node = node.left
        return node

    def get_max(self, node):
        '''Get the maximum value.'''
        while node.right != None:
            node = node.right
        return node


    def delete(self, data):
       if self.root is not None:
            return self.root.delete(data)

    def in_order_print(self, root):
      if not root:
         return
      self.in_order_print(root.left)
      print (root.value)
      self.in_order_print(root.right)

    def inorder(self):
        print()
        if self.root is not None:
            print('Inorder: ')
            self.root.inorder()


#root = Node(8)
#print (root.get())

t = BST()
t.insert(8)
t.insert(4)
t.insert(11)
t.insert(21)

print ("inorder tree")
t.in_order_print(t.getRoot())
t.inorder()

t.delete(21)
print ("inorder tree\n")
#t.in_order_print(t.getRoot())
t.inorder()
print("\n# of children: ", t.root.children_count())
